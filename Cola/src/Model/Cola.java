/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

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
        this.size = size;
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

//    public void inQueue(int value){
//        Node aux = new Node(value);
//        
//        if(this.head != null){
//            this.head.setPrev(aux);
//            aux.setNext(this.head);
////            this.head = aux;
//        }
//        this.head = aux;
//        if(this.tail == null){
//            this.tail = aux;
//        }
//        this.numNodes++;
//    }
    public void inQueue(Object entry) {
//        if (this.size != this.numNodes) {
        Node aux = new Node(entry);

        if (this.tail != null) {
            this.tail.setNext(aux);
            aux.setPrev(this.tail);
//            this.tail = aux;
        }
        this.tail = aux;
        if (this.head == null) {
            this.head = aux;
        }

        this.numNodes++;
//        } else {
//            System.out.println("Tamaño excedido!!!");
//        }
    }

    public Node deQueue() {
//        int value;
        if (numNodes != 0) {
            if (numNodes != 1) {
                Node temp = this.head;
//        value = temp.getValue();

                this.head = temp.getNext();
                this.head.setPrev(null);
                this.numNodes--;
                return temp;
            } else {
                Node temp = this.head;
                this.setHead(null);
                this.setTail(null);
                this.numNodes--;
                return temp;
            }
        } else {
            System.out.println("No hay elementos en la cola!!!");
        }
        return null;
    }

    public void printCola() {
        Node temp = this.head;
        System.out.println("\nNumber of elements: " + this.numNodes);
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println("\n\n\n");
    }

    public void magicPotion() {
        int m;
        Scanner rd = new Scanner(System.in);
        System.out.println("Ingrese la posicion a obtener");
        m = rd.nextInt();
        if (m <= this.size) {
            m--;
            Node temp = this.getHead();
            for (int i = 0; i < m; i++) {
                temp = temp.getNext();
            }
            System.out.println(temp.getValue());
        } else {
            Node temp;
//            Object value = temp.getValue();

            while (this.size < m) {
                temp = this.deQueue();
                Object value = temp.getValue();
                this.inQueue(value);
                this.inQueue(value);
                this.size++;
            }

            System.out.println(this.getTail().getValue());
        }
    }

    public void process(int n) {
        Scanner rd = new Scanner(System.in);
        Cola ideal = new Cola(n);
        int orden;
        int iteracion = 0;
        System.out.println("Los procesos ingresados...");
        this.printCola();
        System.out.println("Ingrese orden ideal de ejecucion.\n");
        for (int i = 0; i < n; i++) {
            orden = rd.nextInt();
            ideal.inQueue(orden);
        }

        while (this.getHead() != null) {
            if (this.getHead().getValue() == ideal.getHead().getValue()) {
                this.deQueue();
                ideal.deQueue();
                iteracion++;
            } else {
                this.inQueue(this.deQueue().getValue());
                iteracion++;
            }
        }

        System.out.println("Unidad/es de tiempo: " + iteracion);
    }
}
