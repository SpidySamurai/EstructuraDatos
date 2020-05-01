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
public class Hashtable {

    DoubleLinkedList doubll;
    int size;

    public Hashtable(int size) {
        this.size = size;
        this.doubll = new DoubleLinkedList(size);
    }

    public DoubleLinkedList getDoubll() {
        return doubll;
    }

    public int getSize() {
        return size;
    }

    public void printHash() {
        Node aux = this.doubll.getHead();
        System.out.println("///HASH TABLE ///");
        while (aux != null) {
            System.out.print(aux.getKey() + " ");
            DoubleLinkedList auxList = (DoubleLinkedList) aux.getContent();
            Node auxInterno = auxList.getHead();
            while (auxInterno != null) {
                System.out.print((Integer) auxInterno.getContent() + " ");
                auxInterno = auxInterno.getNext();
            }
            System.out.println("");
            aux = aux.getNext();
        }
        System.out.println("/////////////////");
    }

    public int funcionHash(int K) {
        return K % this.size;
    }

    public void insertChained(int element) {
        int index = this.funcionHash(element);
        Node aux = this.getDoubll().getHead();

        while (aux != null) {
            if (aux.getKey() == index) {
                DoubleLinkedList auxList = (DoubleLinkedList) aux.getContent();
                auxList.addAtHead(new Node(element, auxList.getSize() + 1));
                break;
            }
            aux = aux.getNext();
        }
    }

    public void deleteChained(int element) {
        int index = this.funcionHash(element);
        Node aux = this.getDoubll().getHead();

        while (aux != null) {
            if (aux.getKey() == index) {
                DoubleLinkedList auxList = (DoubleLinkedList) aux.getContent();
                auxList.deleteElement(element, index);

            }
            aux = aux.getNext();
        }
    }

    public void searchChained(int element) {
        int index = this.funcionHash(element);

        Node aux = this.getDoubll().getHead();

        while (aux != null) {
            if (aux.getKey() == index) {
                DoubleLinkedList auxList = (DoubleLinkedList) aux.getContent();
                auxList.searchElement(element, index);

            }
            aux = aux.getNext();
        }
    }

}
