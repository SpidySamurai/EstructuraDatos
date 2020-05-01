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
public class Node {

    private Object content;
    private Node prev;
    private Node next;
    private int key;

    public Node(Object content, int key) {
        this.content = content;
        this.key = key;
        prev = null;
        next = null;
    }

    public Object getContent() {
        return content;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public int getKey() {
        return this.key;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean contentEmpty() {
        return this.content == null;
    }

}
