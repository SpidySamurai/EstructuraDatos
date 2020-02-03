/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A13003975
 */
public class Cola {

    private Node head;
    private Node tail;
    private int numNodes;
    private int size;

    public Cola(int size) {
        this.head = null;
        this.tail = null;
        this.numNodes = 0;
        this.size=size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }
    
    public void inQueue(int value){
        Node aux = new Node(value);
        
        if(this.head != null){
            this.head.setPrev(aux);
            aux.setNext(this.head);
//            this.head = aux;
        }
        this.head = aux;
        if(this.tail == null){
            this.tail = aux;
        }
        this.numNodes++;
    }
    
//    public void addAtTail(int value) {
//        Node aux = new Node(value);
//
//        if (this.tail != null) {
//            this.tail.setNext(aux);
//            aux.setPrev(this.tail);
////            this.tail = aux;
//        }
//        this.tail = aux;
//        if(this.head == null){
//            this.head = aux;
//        }
//        
//        this.numNodes++;
//    }
    
    public int deQueue(){
        int value;
        Node temp = this.tail;      
        value = temp.getValue();
        
        this.tail = temp.getPrev();
        this.tail.setNext(null);
        
        return value;
    }
    

    public void printList() {
        Node temp = this.head;
        System.out.println("Number of elements: " + this.numNodes);
        while (temp != null) {
            System.out.print(temp.getValue()+" ");
            temp = temp.getNext();
        }
        System.out.println(" ");
        temp = this.tail;
        while (temp != null) {
            System.out.print(temp.getValue()+" ");
            temp = temp.getPrev();
        }
        
    }

}
