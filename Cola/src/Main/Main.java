package Main;

import Model.*;

/**
 *
 * @author A13003975
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola a = new Cola(5);
        a.inQueue(5);
        a.inQueue(2);
        a.inQueue(8);
        a.deQueue();
        a.deQueue();
//        a.deQueue();
        
        a.printCola();
    }
    
}
