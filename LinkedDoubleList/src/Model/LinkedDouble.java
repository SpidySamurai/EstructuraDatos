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
public class LinkedDouble {

    private Node head;
    private Node tail;
    private int numNodes;

    public LinkedDouble() {
        this.head = null;
        this.tail = null;
        numNodes = 0;
    }

    public void addOrder(int c, int e) {
        Node aux = new Node(c, e);

        if (this.head == null && this.tail == null) {
            this.head = aux;
            this.tail = aux;
            this.numNodes++;
        } else if (this.numNodes == 1) {
            if (aux.getExpo() < this.head.getExpo()) {
//               aux.setNext(this.head);
                this.head.setPrev(aux);
                aux.setNext(this.head);
                this.tail = this.head;
                this.head = aux;
                this.numNodes++;
//                this.addAtHead(aux);
            } else if (aux.getExpo() > this.head.getExpo()) {
                aux.setPrev(this.head);
                this.head.setNext(aux);
                this.tail = aux;
                this.numNodes++;
//                this.addAtTail(aux);
            } else {
                int tempc;
                tempc = this.head.getCoef() + aux.getCoef();
                this.head.setCoef(tempc);

                if (this.head.getCoef() == 0) {
                    this.head = null;
                    this.tail = null;
                    this.numNodes = 0;
                }
            }
        } else if (this.head.getExpo() > aux.getExpo()) {
            this.addAtHead(aux);
        } else if (this.tail.getExpo() < aux.getExpo()) {
            this.addAtTail(aux);
        } else {
            Node temp = this.head;
            Node temp2 = temp.getNext();
            while (temp2 != null) {
                if (temp.getExpo() < aux.getExpo() && aux.getExpo() < temp2.getExpo()) {
                    aux.setPrev(temp);
                    aux.setNext(temp2);
                    temp.setNext(aux);
                    temp2.setPrev(aux);
                    this.numNodes++;
                }
                temp = temp.getNext();
                temp2 = temp2.getNext();
            }
            temp = this.head;
//            temp2 = temp.getNext();
            while (temp != null) {
                if (temp.getExpo() == aux.getExpo()) {
                    temp.setCoef(temp.getCoef() + aux.getCoef());
                }
                temp = temp.getNext();
            }
        }
    }

    public void addAtHead(Node aux) {
        Node temp = this.head;
        this.head = aux;  //It is the new head
        temp.setPrev(this.head);
        this.head.setNext(temp);
        this.numNodes++;
    }

    public void addAtTail(Node aux) {
        //NodeDoble temp = tail;
        aux.setPrev(this.tail);
        this.tail.setNext(aux);
        this.tail = aux;
        this.numNodes++;
    }

    public void printList() {
        Node temp = this.head;
        System.out.println("Number of elements: " + this.numNodes);
        while (temp != null) {
            if (temp.getCoef() > 0) {
                System.out.print("+ ");
            }
            System.out.print(temp.getCoef() + "x^" + temp.getExpo() + " ");

//            if (temp.getCoef() > 0) {
//                System.out.print("+ ");
//            } 
//else if (temp.getCoef() < 0) {
//                System.out.print("- ");
//            }
            temp = temp.getNext();
        }
    }

    public int getSize() {
        return this.numNodes;
    }

    public Node getHead() {
        return this.head;
    }

    public LinkedDouble sumar(LinkedDouble a, LinkedDouble b) {
        LinkedDouble c = new LinkedDouble();

        Node temp = a.getHead();
        while (temp != null) {
            c.addOrder(temp.getCoef(), temp.getExpo());
            temp = temp.getNext();
        }
        temp = b.getHead();

        while (temp != null) {
            c.addOrder(temp.getCoef(), temp.getExpo());
            temp = temp.getNext();
        }

        return c;
    }

    public LinkedDouble multiplicar(LinkedDouble a, LinkedDouble b) {
        LinkedDouble c = new LinkedDouble();
        Node temp = a.getHead();
        Node temp2 = b.getHead();
        Node aux;

        while (temp != null) {
            while (temp2 != null) {
                aux = new Node(temp.getCoef() * temp2.getCoef(), temp.getExpo() + temp2.getExpo());
                c.addOrder(aux.getCoef(), aux.getExpo());
                temp2 = temp2.getNext();
            }
            temp = temp.getNext();
            temp2 = b.getHead();
        }

        return c;
    }

}
