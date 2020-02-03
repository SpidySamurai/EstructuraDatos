package Model;

/**
 *
 * @author A13003975
 */
public class Node {
    private Node next;
    private Node prev;
    private int value;

    public Node(int value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
}
