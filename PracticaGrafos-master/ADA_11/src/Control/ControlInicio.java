/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.*;
import ada_11.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan D.M
 */
public class ControlInicio extends MouseAdapter implements ActionListener {

    private int dirX;
    private int dirY;
    private Nodo jalada = null;
    Inicio inicio;
    Grafo grafo;
    //private Nodo nodo;

    public ControlInicio(Inicio ini, Grafo graf) {
        //  this.grafo = graf;
        //  this.nodo = node;    
        inicio = ini;
        grafo = graf;
        inicio.getjMenuItem1().addActionListener(this);
        inicio.getjMenuItem2().addActionListener(this);
        inicio.addMouseListener(this);
        inicio.addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        //Accion por el cual permite enlazar los nodos mediante comandos de menus
        if (inicio.getjMenuItem1() == evento.getSource()) {

            int ini = -1;
            int fin = -1;

            try {
                ini = Integer.parseInt(JOptionPane.showInputDialog("Ingresar nodo inicial"));
                fin = Integer.parseInt(JOptionPane.showInputDialog("Ingresar nodo destino"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(inicio, "Error:   java.lang.NumberFormatException");
            }
            grafo.anadirArista(ini, fin);

        }
        //Accion que permite mostrar la matriz de adyacencias
        if (inicio.getjMenuItem2() == evento.getSource()) {
            
            grafo.hacerMatriz();
            
        }
    }

    @Override
    public void mousePressed(MouseEvent evento) {
        dirX = evento.getX();
        dirY = evento.getY();
        grafo.createNode(dirX, dirY); //Agrega un nodo a la lista de nodos
    }

}
