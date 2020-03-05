/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada6;

/**
 *
 * @author Jose Manuel Patron
 */
public class UniquenessTesting {
    
    public void testUniqueness(long[] lista){
        long num;
        for(int i=0; i< lista.length-1; i++){
            if(lista[i] == lista[i+1]){
                num= lista[i];
                System.out.println("La lista contiene elementos iguales en la posicion " + i +" y  " + i + " el numero es " + num);
            }
        }
        System.out.println("La lista contiene unicamente elementos unicos");
    
    }
    
}
