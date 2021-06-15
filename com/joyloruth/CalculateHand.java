package com.joyloruth;

import java.awt.Color;
import java.awt.Component;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculateHand{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JTextField field = new JTextField();
		JPanel panel = new JPanel();
		
		frame.setBounds(0, 0, 600, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		
		
		JLabel label = new JLabel();
		
		label.setBounds(0, 0, 300, 300);
		label.setBackground(Color.blue);
		label.setOpaque(true);
		
		field.setBounds(50, 50, 100, 30);


		frame.add(label);
		frame.add(field);
		
		
		
		/*new PokerFrame();
		
		Scanner scan = new Scanner(System.in);
		
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		
		Main main = new Main();
		main.pokerHand(a, b); */
		
		
	
	}
	
	
	
	void pokerHand() 
	{
		System.out.println("hello");
		//POCKET PAIRS
		/*if(a == "A" && b == "A") System.out.println("85 %");
		if(a == "K" && b == "K") System.out.println("85 %");
		if(a == "Q" && b == "Q") System.out.println("85 %");
		if(a == "J" && b == "J") System.out.println("85 %");
		
		if(a == "10" && b == "10") System.out.println("85 %");
		if(a == "9" && b == "9") System.out.println("85 %");
		if(a == "8" && b == "8") System.out.println("85 %");
		if(a == "7" && b == "7") System.out.println("85 %");
		if(a == "6" && b == "6") System.out.println("85 %");
		if(a == "5" && b == "5") System.out.println("85 %");
		if(a == "4" && b == "4") System.out.println("85 %");
		if(a == "3" && b == "3") System.out.println("85 %");
		if(a == "2" && b == "2") System.out.println("85 %");*/
		
		
		
		/*//PREMIUM HANDS
		if(a == "A" && b == "K" || a == "K" && b == "A") System.out.println("66 %");
		if(a == "A" && b == "Q" || a == "Q" && b == "A") System.out.println("67 %");
		if(a == "A" && b == "J" || a == "J" && b == "A") System.out.println("65 %");*/
		

	}
	
	
}

