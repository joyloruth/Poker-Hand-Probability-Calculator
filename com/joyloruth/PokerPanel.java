package com.joyloruth;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class PokerPanel extends JPanel implements MouseListener{
	
	
	
	
	PokerPanel(){
		
		this.setBackground(Color.cyan);
	
		this.setBounds(0,0,200,200);
		this.setOpaque(true);
		
		CalculateHand calculateHand = new CalculateHand();
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("hello");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("hello");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
