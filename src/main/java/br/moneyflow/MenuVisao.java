package br.moneyflow;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MenuVisao extends JFrame{
	
	private Color corBackground;
	
	private JDesktopPane desktop;
	
	public MenuVisao() {
		super("MoneyFlow");
		
		try { 
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");	// Java Swing Nimbus
		} 
		catch (Exception e) 
		{ }
		
		inicializaComponentes();
	}
	
	private void inicializaComponentes() {
		
		corBackground = new Color(15, 54, 57); 
		desktop = new JDesktopPane(){ 
			public void paintComponent(Graphics g){   
				g.setColor(corBackground);
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		};

		add(desktop);
	}
}
