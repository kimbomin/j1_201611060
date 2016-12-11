package com.sd.Yutnori;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class back extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
    public back() {
        icon = new ImageIcon("c:\\back.jpg");
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
    }
    public static void main(String[] args) {
        back frame = new back();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(660, 670);
        frame.setVisible(true);
    }
}