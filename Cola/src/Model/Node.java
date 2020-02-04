package Model;

/**
 *
 * @author A13003975
 */
public class Node {
    private Node next;
    private Node prev;
    private Object value;

    public Node(Object entry) {
        this.next = null;
        this.prev = null;
        this.value = entry;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Object getValue() {
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
