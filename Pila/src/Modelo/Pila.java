/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Pila {

    private Node head;
    private Node tail;
    private int size;
    private int numNodes;
    private int height;

    public Pila(int size) {
        this.head = null;
        this.tail = null;
        this.size = size;
        this.numNodes = 0;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getHeight() {
        return height;
    }

    public void Push(Object entry) {
        if (this.size != this.numNodes) {
            Node aux = new Node(entry);

            if (this.tail != null) {
                this.tail.setNext(aux);
                aux.setPrev(this.tail);
            }

            this.tail = aux;

            if (this.head == null) {
                this.head = aux;
            }
            this.height += (int) entry;
            this.numNodes++;
        } else {
            System.out.println("Overflow");
        }

    }

    public Object Pop() {

        if (this.numNodes != 0) {
            if (this.numNodes != 1) {
                Node aux = this.tail;
                this.tail = this.tail.getPrev();
                this.tail.setNext(null);
                this.numNodes--;
                this.height -= (int) aux.getValue();
                return aux.getValue();
            } else {
                Node aux = this.tail;
                this.setHead(null);
                this.setTail(null);
                this.numNodes--;
                this.height -= (int) aux.getValue();
                return aux.getValue();
            }
        } else {
            System.out.println("Underflow");
        }

        return null;
    }

    public Object Peek() {
        return this.tail.getValue();
    }

    public void printPila() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(" " + temp.getValue());
            temp = temp.getNext();
        }

    }

    public Object max() {
        if (this.numNodes != 0) {
            Node temp = this.head;
            int max = 0;
            int current;
            while (temp != null) {
                current = (int) temp.getValue();
                if (max < current) {
                    max = (int) temp.getValue();
                }
                temp = temp.getNext();
            }
            return max;
        } else {
            System.out.println("No hay elementos en la pila.");
        }

        return null;
    }

    public void maximun() {
        Scanner rd = new Scanner(System.in);
        int opc;
        int value;
        System.out.print("Ingrese una opcion: ");
        opc = rd.nextInt();
        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.print("Ingresar un elemento a la pila: ");
                    value = rd.nextInt();
                    this.Push(value);
                    break;
                case 2:
                    System.out.println("Eliminando un elemento de la pila.");
                    this.Pop();
                    break;
                case 3:
                    System.out.println("Elemento mas grande la pila: " + this.max());

                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
            System.out.print("Ingrese una opcion: ");
            opc = rd.nextInt();
        }

    }

    public static void equalStack(Pila a, Pila b, Pila c) {
        int equalheight;

        while (true) {
            if(a.getHeight()==0 || b.getHeight()==0  || c.getHeight() == 0){
                System.out.println(""+a.getHeight());
                break;
            }
            if (a.getHeight() == b.getHeight() && b.getHeight() == c.getHeight()) {
                System.out.println(""+a.getHeight());
                break;
            }
             
            if(a.getHeight() > b.getHeight() && a.getHeight() > c.getHeight())
                a.Pop();
            else if(b.getHeight() > a.getHeight() && b.getHeight() > c.getHeight())
                b.Pop();
            else if(c.getHeight() > b.getHeight() && c.getHeight() > a.getHeight())
                c.Pop();
        }
        
    }
    
}
