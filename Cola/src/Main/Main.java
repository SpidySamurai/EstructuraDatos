package Main;

import Menu.Menu;
import Model.*;
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
        int opc;
        int n;
        int proceso;
        String person;
        Scanner rd = new Scanner(System.in);
        Scanner entry = new Scanner(System.in);
        opc = Menu.printMenu();

        while (opc != 3) {
            switch (opc) {
                case 1:
                    System.out.print("\n\nIngrese el tamaño de la cola: ");
                    n = rd.nextInt();
                    Cola personas = new Cola(n);
                    for (int i = 0; i < n; i++) {
                        person = entry.nextLine();
                        personas.inQueue(person);      
                    }
                    personas.magicPotion();
                    personas.printCola();
                    break;
                case 2:
                    System.out.print("\n\nIngrese el tamaño de la cola: ");
                    n = rd.nextInt();
                    Cola procesos = new Cola(n);
                    for (int i = 0; i < n; i++) {
                        proceso = rd.nextInt();
                        procesos.inQueue(proceso);
                    }
                    procesos.process(n);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
            opc = Menu.printMenu();
        }

    }

}
