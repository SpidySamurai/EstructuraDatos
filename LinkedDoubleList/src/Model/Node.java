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
public class Node {
    private Node next;
    private Node prev;
    private int coef;
    private int expo;
    
    public Node(int c,int e){
        this.next = null;
        this.prev = null;
        this.coef = c;
        this.expo = e;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int getCoef() {
        return coef;
    }

    public int getExpo() {
        return expo;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public void setExpo(int expo) {
        this.expo = expo;
    }
    
    
}
