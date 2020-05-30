/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada_11;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Juan D.M
 */
public class Arista {
    private Nodo start;
    private Nodo end;
    private double weight;
    private int id;
    Color color = Color.BLACK;
    
    public Arista(Nodo s, Nodo e) {
        this.start = s;
        this.end = e;
    }
    
    public Arista(Nodo s, Nodo e, double w, int id) {
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public Nodo getStart() {
        return this.start;
    }
    
    public int getIdOfStartNode() {
        return this.start.getNodeId();
    }
    
    public Nodo getEnd() { 
        return this.end; 
    }
    
    public int getIdOfEndNode() {
        return this.end.getNodeId();
    }
    
    public double getWeight() {
        return this.weight;
    }

    public void painter(Graphics g) {
        g.setColor(Color.BLUE);
        g.setColor(color);
        g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Nodo getFfinal() {
        return start;
    }

    public Nodo getInicial() {
        return end;
    }
    
}
