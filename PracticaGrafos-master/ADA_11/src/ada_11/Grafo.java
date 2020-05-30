/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada_11;

import View.Inicio;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juan D.M
 */
public class Grafo extends JPanel {

    Inicio inicio;
    Nodo nodo;
    Arista arista;
    private List<Nodo> ListaNodos = new ArrayList<Nodo>();
    private List<Arista> ListaAristas = new ArrayList<Arista>();
    private List<Integer> ListaIdInicial = new ArrayList();
    private List<Integer> ListaIdFinal = new ArrayList();
    private int numberOfNodes = 0;

    public Grafo(Inicio ini) {
        inicio = ini;

    }

    public boolean checkForAvailability() { // will be used in Main.java
        return this.numberOfNodes > 1;
    }

    //Se agrega un nodo y se crea en el grafo
    public void createNode(int x, int y) {
        nodo = new Nodo(ListaNodos.size(), x, y);
        ListaNodos.add(nodo);
        numberOfNodes++; // a node has been added
        repaint();
        inicio.repaint();
        //inicio.setVisible(false);
    }

    public void anadirArista(int x, int y) {
        try {

            arista = new Arista(ListaNodos.get(x), ListaNodos.get(y));
            this.ListaAristas.add(arista);
            this.ListaIdInicial.add(arista.getIdOfStartNode());
            this.ListaIdFinal.add(arista.getIdOfEndNode());
            repaint();
            inicio.repaint();

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No se encontro el nodo");
        }
    }

    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

    public void hacerMatriz() {
        StringBuilder s = new StringBuilder();
//        int matrizAdy[][] = new int[this.numberOfNodes][this.numberOfNodes];

//        Iterator IdIni = ListaIdInicial.iterator();
//        Iterator IdFin = ListaIdFinal.iterator();
        try {
            for (int i = 0; i < this.numberOfNodes; i++) {
                for (int j = 0; j < this.numberOfNodes; j++) {

                    if ((arista.getIdOfStartNode() == i && arista.getIdOfEndNode() == j) || (arista.getIdOfStartNode() == j && arista.getIdOfEndNode() == i)) {
                        s.append("1 ");
//                        matrizAdy[i][j] = 1;
//                        matrizAdy[j][i] = 1;
                    } else {
                        s.append("0 ");
//                        matrizAdy[i][j] = 0;
//                        matrizAdy[j][i] = 0;
                    }

                }
                s.append("\n");
            }

        } catch (IndexOutOfBoundsException e1) {
            JOptionPane.showMessageDialog(null, "ERROR");
        } catch (NullPointerException e2) {
            for (int i = 0; i < this.numberOfNodes; i++) {
                for (int j = 0; j < this.numberOfNodes; j++) {
                    s.append("0 ");
                }
                s.append("\n");
            }
        }
        System.out.println("" + s.toString());

    }

//    public void impimirMatriz(int matrizAdy[][]) {
//        for (int i = 0; i < this.numberOfNodes; i++) {
//            for (int j = 0; j < this.numberOfNodes; j++) {
//                System.out.println(matrizAdy[i][j]);
//            }
//            System.out.println("\n");
//        }
//    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        ListaAristas.forEach((f) -> {
            f.painter(g);
        });
        ListaNodos.forEach((f) -> {
            f.painter(g, this);
        });
    }
}
