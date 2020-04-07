/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javier
 */
public class DeletingDuplicates {

    public void testDeletingDuplicates(long[] lista) {
        long num;
        long counter = 0;
        int j;
        for (int i = 0; i < lista.length - 1; i++) {

            if (lista[i] == lista[i + 1]) {
                j = i + 1;
                while (lista[i] == lista[j]) {

                    System.out.println(i + " " + j);
                    lista[j] = 0;
                    counter++;
                    if (j + 1 < lista.length) {
                        j++;
                    }
                }
                i = j;
            }
        }
        System.out.println("Elementos repetido eliminados " + counter);

    }

}
