package Model;

public class Node{
    
    private Node link;
    private int value;
    
    public Node(int value) {
        this.value = value;
        this.link = null;
    }

    public Node getLink() {
        return link;
    }

    public int getValue() {
        return value;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public void setValue(int value) {
        this.value = value;
    }  
}