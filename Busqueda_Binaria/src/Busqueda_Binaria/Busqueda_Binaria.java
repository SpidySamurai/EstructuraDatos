package Busqueda_Binaria;

import java.util.Scanner;
/*
Codigo realizado por el alumno Javier Fernando Chi Ortiz


*/

public class Main {

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int liminf;
        int limsup;
        int valorBuscado;
        int[] arreglo;

        System.out.println("Ingresa el limite inferior: ");
        liminf = rd.nextInt();
        System.out.println("Ingrese el limite superior: ");
        limsup = rd.nextInt();
        arreglo = generarArreglo(liminf, limsup);
        System.out.println("Ingrese el numero a buscar: ");
        valorBuscado = rd.nextInt();
        busquedaBinaria(arreglo,valorBuscado);

    }

    public static int busquedaBinaria(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            System.out.println(arreglo[medio]);
            if (arreglo[medio] == dato) {
               
                return medio;
            } else if (arreglo[medio] < dato) {
                inicio = medio + 1;
            } else {
                fin = medio- 1;
            }
        }
        System.out.println("El numero no se encuentra en el arreglo");
        return -1;
    }

    public static int[] generarArreglo(int liminf, int limsup) {
        limsup++;
        int[] arreglo = new int[limsup - liminf];
        int j=0;
        for (int i = liminf; i < limsup; i++) {
//            System.out.println(i);
            arreglo[j] = i;
            j++;
        }

        return arreglo;
    }
}
