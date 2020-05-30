/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada_11;

/**
 *
 * @author Juan D.M
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Grafika extends JPanel {
    private static final int RECT_W = 20; //Tamanos del cuadro o rectangulo
    private static final int RECT_H = 30; //Tamanos del cuadro o rectangulo
    private static final int PREF_W = 600;
    private static final int PREF_H = PREF_W;
    private static final Color MY_COLOR = Color.RED;    
    private int myX = 0;
    private int myY = 0;

    public Grafika() {
        MyMouse myMouse = new MyMouse();
        addMouseListener(myMouse);  // add MouseListener
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // **MUST** call this 
        g.setColor(MY_COLOR);
        g.fillRect(myX, myY, RECT_W, RECT_H);
    }

    private class MyMouse extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            myX = e.getX();
            myY = e.getY();
            repaint(); // repaint the whole JPanel
        }
    }

    @Override  // to make the GUI larger
    public Dimension getPreferredSize() {
        if (isPreferredSizeSet()) {
            return super.getPreferredSize();
        }
        return new Dimension(PREF_W, PREF_H);
    }

    private static void createAndShowGui() {
        Grafika mainPanel = new Grafika();

        JFrame frame = new JFrame("Grafika");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGui();
        });
    }
}