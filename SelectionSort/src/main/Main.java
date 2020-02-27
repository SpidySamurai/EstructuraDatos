package main;

import java.util.LinkedList;
import java.util.Scanner;
import model.Equipo;
import model.Juego;
import model.Menu;
import model.Premio;
import model.Randomizer;
import model.SelectionSort;

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Scanner rdi = new Scanner(System.in);
        LinkedList<Equipo> equipos = new LinkedList<>();
        LinkedList<Premio> premios = new LinkedList<>();
        int opc;

        equipos.add(new Equipo("Alpha"));
        equipos.add(new Equipo("Beta"));
        equipos.add(new Equipo("Zeta"));

        premios.offer(new Premio("Television", 500));
        premios.offer(new Premio("Xbox", 659));

        opc = Menu.printMenu();

        while (opc != 4) {
            switch (opc) {
                case 1:
                    premios.clear();
                    String nombrePremio;
                    int precioPremio;
                    int n;
                    System.out.print("Ingrese cantidad de premios: ");
                    n = rdi.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingrese premio " + (i + 1));
                        nombrePremio = rd.nextLine();
                        System.out.print("Ingrese precio ");
                        precioPremio = rd.nextInt();
                        Premio temp = new Premio(nombrePremio, precioPremio);
                        premios.offer(temp);
                    }

                    break;
                case 2:
                    equipos.clear();
                    String nombreEquipo;
                    System.out.print("Ingrese cantidad de equipos: ");
                    n = rdi.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingrese nombre de equipo: ");
                        nombreEquipo = rd.nextLine();
                        Equipo temp = new Equipo(nombreEquipo);
                        equipos.add(temp);
                    }

                    break;
                case 3:
                    Juego.generarJuego(equipos, premios);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");

            }
            opc = Menu.printMenu();
        }
        
    }

}
