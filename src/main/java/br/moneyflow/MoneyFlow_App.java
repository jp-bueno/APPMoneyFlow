package br.moneyflow;

import java.awt.Color;

import javax.swing.JFrame;

public class MoneyFlow_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color corBackground;
		corBackground = new Color(15, 54, 57);
	
//		new TelaSplash();
		
		TelaLogin l = new TelaLogin(corBackground);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setBounds(100, 100, 800, 700);
		l.setVisible(true);
	}

}
