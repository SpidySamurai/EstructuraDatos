/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javier.model;

/**
 *
 * @author Javier
 */
public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;
    int numNodes;

    public DoubleLinkedList(int size) {
        this.head = null;
        this.tail = null;
        this.size = size;
        this.numNodes = 0;

        for (int i = 0; i < size; i++) {
            this.addAtTail(new Node(new DoubleLinkedList(0), i));
        }

    }

    public void addAtHead(Node aux) {
        if (this.isEmpty()) {
            this.head = aux;
            this.tail = aux;
        } else {
            Node temp = this.head;
            this.head = aux;  //It is the new head
            temp.setPrev(this.head);
            this.head.setNext(temp);
        }
        this.numNodes++;
    }

    public void addAtTail(Node aux) {
        //NodeDoble temp = tail;
        if (this.isEmpty()) {
            this.head = aux;
            this.tail = aux;
        } else {
            aux.setPrev(this.tail);
            this.tail.setNext(aux);
            this.tail = aux;
        }
        this.numNodes++;
    }

    public void deleteElement(int element, int index) {

//        System.out.println("sssssss" + this.getNumNodes());
        if (this.isEmpty()) {
            System.out.println(" No hay elementos en la clave " + index);

        } else if (this.head == this.tail && element == (Integer) this.head.getContent()) {
            this.head = this.tail = null;
        } else if (element == (Integer) this.getHead().getContent()) {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        } else if (element == (Integer) this.getTail().getContent()) {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);

        } else {
            Node auxPrev = this.getHead();
            Node auxTemp = this.getHead().getNext();

            while (auxTemp != null && (Integer) auxTemp.getContent() != element) {
                auxPrev = auxPrev.getNext();
                auxTemp = auxTemp.getNext();
            }
            if (auxTemp != null) {
                auxPrev.setNext(auxTemp.getNext());
            } else {
                System.out.println("El elemento no se encontro.");
            }

        }
    }

    public boolean searchElement(int element, int index) {
        Node aux = this.getHead();

        while (aux != null) {
            if ((Integer) aux.getContent() != element) {
                System.out.println("El elemento se encontro en la clave " + index);
                return true;

            }

            aux = aux.getNext();
        }
        System.out.println("El elemento no se encontro en la clave " + index);
        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public int getNumNodes() {
        return this.numNodes;
    }

    public boolean isEmpty() {
        return this.numNodes == 0;
    }

    public void printListKey() {
        Node aux = this.head;
        while (aux != null) {
            System.out.println(aux.getKey());
            aux = aux.getNext();
        }
    }

}
