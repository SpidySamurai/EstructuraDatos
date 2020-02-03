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
        
        LinkedDouble a = new LinkedDouble();
        a.inQueue(5);
        a.inQueue(2);
        a.inQueue(5);
        a.deQueue();
        
        a.printList();
    }
    
}
