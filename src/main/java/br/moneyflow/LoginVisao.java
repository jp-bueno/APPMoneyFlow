package br.moneyflow;

import javax.swing.JFrame;

public class LoginVisao extends JFrame{
	public LoginVisao() {
		menuMoneyFlow();
	}
	
	private void menuMoneyFlow() {
		MenuVisao m = new MenuVisao();
		m.setSize(1080, 720);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setResizable(false);
        m.setLocationRelativeTo(null); // Centraliza a janela na tela
		m.setVisible(true);
	}
}
