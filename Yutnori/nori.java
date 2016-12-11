package com.sd.Yutnori;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class nori extends JFrame implements ActionListener {
	JTextField Player1Tf;
	JTextField Player2Tf;
	JTextField ResultTf;
	JButton b1;
	JButton b2;
	public nori() {
		JPanel panel=new JPanel(new GridLayout(3,3));
		getContentPane().add(panel);
		JLabel label1=new JLabel("Player1");
		JLabel label2=new JLabel("Player2");
		JLabel label3=new JLabel("Result");
		Player1Tf=new JTextField(10);
		Player2Tf=new JTextField(10);
		ResultTf=new JTextField(10);
		b1=new JButton("Throw");
		b2=new JButton("Cancel");
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(Player1Tf);
		panel.add(Player2Tf);
		panel.add(ResultTf);
		panel.add(b1);
		panel.add(b2);
	}
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if (b == b1) {
			b.setText("Re-throw");
		}
		else if (b == b2) {
			Player1Tf.setText("");
			Player2Tf.setText("");
		}
	}
	JScrollPane scrollPane;
    ImageIcon icon;
    public void back() {
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
		nori y=new nori();
		y.setDefaultCloseOperation(EXIT_ON_CLOSE);
		y.pack();
		y.setVisible(true);
	}
}