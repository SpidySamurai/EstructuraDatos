/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada_11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan D.M
 */
public class Nodo {

    private int id, x, y;
    Image image;
    private List<Arista> neighbours = new ArrayList<Arista>();
    
    public Nodo(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
        image = new ImageIcon(getClass().getResource("../Icons/esfera.png")).getImage(); //Imagen del nodo encontrado en el directorio icons
    }
    
    public void painter(Graphics g,Grafo gl) { //Coloca el dibujo en la ventana
            g.drawImage(image, x-15, y-15, gl);
            g.setColor(Color.RED);
            g.drawString(""+id, x-15, y-15);
            g.drawString(""+id, x-14, y-14);
    }
    
    public int getNodeId() {
        return this.id;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void transladar(int dx,int dy) {
        this.x+=dx; this.y+=dy;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean jaladopor(Point d) {
        if(d.distance(x, y)<=15) {
            return true;
        }
         else {
                return false;
         }
    }
    
    public void addNeighbour(Arista e) {
        if(this.neighbours.contains(e)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            System.out.println("Successfully added " + e);
            this.neighbours.add(e);
        }
    }
    public void getNeighbours() {
        System.out.println("List of all edges that node " + this.id +" has: ");
        System.out.println("=================================");
        for (int i = 0; i < this.neighbours.size(); i++ ){
            System.out.println("ID of Edge: " + neighbours.get(i).getId() + "\nID of the first node: " + neighbours.get(i).getIdOfStartNode() + 
            "\nID of the second node: " + neighbours.get(i).getIdOfEndNode());
            System.out.println();
        }
        System.out.println(neighbours);
    }
    
}
