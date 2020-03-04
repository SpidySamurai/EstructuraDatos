/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada6;

import java.util.Random;

/**
 *
 * @author Juan D.M
 */
public class ADA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random objGenerator = new Random();
        
        SelectionSort listasordenSelect[] = new SelectionSort[10];
        InsertionSort listasinsertSelect[] = new InsertionSort[10];
        
        SelectionSort ordenSeleccion = new SelectionSort(10000);
        InsertionSort ordenInserccion = new InsertionSort(10000); 
        
        System.out.print("CASO\t");
        System.out.print("SelectionSort\t");
        System.out.print("InsertionSort\t");
        
        for(int i = 0; i<listasordenSelect.length; i++){
            listasordenSelect[i] = new SelectionSort(10000);
            listasinsertSelect[i] = new InsertionSort(10000); 
            
            for(int j = 0; j<10000; j++){
                int randomNumber = objGenerator.nextInt(10000);
                listasordenSelect[i].insert(randomNumber);
                listasinsertSelect[i].insert(randomNumber);
            }

            System.out.print("\n");
            System.out.print("CASO " + i + "\t");
            
            //Realiza orden por seleccion
            listasordenSelect[i].selectionSort();
            System.out.print("\t");
 
            //Realiza orden por inserccion
            listasinsertSelect[i].insertionSort();      
            System.out.println("\t");
            
        }

    }
    
}
