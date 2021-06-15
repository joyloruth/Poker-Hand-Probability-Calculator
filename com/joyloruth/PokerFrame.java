package com.joyloruth;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PokerFrame extends JFrame {
	
	PokerPanel panel = new PokerPanel();
	
	private static final long serialVersionUID = 1L;

	PokerFrame(){
		
		
		this.setBounds(0, 0, 600, 600);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Poker Starting Hands");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		this.add(panel);
		
		
		
	}

}
