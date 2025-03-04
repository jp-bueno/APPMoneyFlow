package br.moneyflow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
	
	private Color corBackground;

	private JPanel contentPane;
	private JPanel panel;
	
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;

	public TelaLogin(Color corBackground) {
		super("Tela de Login");
		
		try { 
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");	// Java Swing Nimbus
		} 
		catch (Exception e) 
		{ }
		
		this.corBackground = corBackground;
		
		inicializaComponentes();	
	}
	
	private void inicializaComponentes() {
		contentPane = new JPanel();
		contentPane.setBackground(this.corBackground);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 100, 480, 540);
		panel.setBackground(new Color(240, 235, 229));
//		panel.setBorder(new EmptyBorder(25, 25, 25, 25));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_login = new JLabel("Login MoneyFlow"); 
		lbl_login.setFont(new Font("Inter", Font.BOLD, 24));
		lbl_login.setBounds(129, 124, 206, 29);
		panel.add(lbl_login);
		
		JLabel lbl_boas_vindas = new JLabel("bem vindo de volta! insira seus dados");
		lbl_boas_vindas.setFont(new Font("", Font.CENTER_BASELINE, 12));
		lbl_boas_vindas.setBounds(115, 170, 250, 40);
		panel.add(lbl_boas_vindas);
		
		
//		JLabel lblNewLabel = new JLabel("Usuário");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lblNewLabel.setBounds(42, 54, 46, 14);
//		panel.add(lblNewLabel);
//		
//		textFieldUsuario = new JTextField();
//		textFieldUsuario.setBounds(42, 67, 160, 20);
//		panel.add(textFieldUsuario);
//		textFieldUsuario.setColumns(10);
//		
//		JLabel lblNewLabel_1 = new JLabel("Senha");
//		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lblNewLabel_1.setBounds(42, 118, 46, 14);
//		panel.add(lblNewLabel_1);
//		
//		JButton btnNewButton = new JButton("Entrar");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Criptografia criptografia =  new Criptografia(passwordField.getText(), Criptografia.MD5);
//				System.out.println(criptografia.criptografar());
//				if(textFieldUsuario.getText()!=null && 
//						!textFieldUsuario.getText().isEmpty() &&
//						passwordField.getText()!=null &&
//						!passwordField.getText().isEmpty()) {
//					if(criptografia.criptografar().equals("E10ADC3949BA59ABBE56E057F20F883E")) {
//					JOptionPane.showMessageDialog(btnNewButton, "Informações válidas");
//					dispose();
//					JPrincipal jPrincipal = new JPrincipal();
//					jPrincipal.setLocationRelativeTo(jPrincipal);
//					jPrincipal.setVisible(true);
//					}
//					
//				}else {
//					JOptionPane.showMessageDialog(btnNewButton, "Verifique as informações", "Aviso", JOptionPane.WARNING_MESSAGE);
//				}
//			}
//		});
//		btnNewButton.setBackground(new Color(49, 62, 64));
//		btnNewButton.setForeground(Color.WHITE);
//		btnNewButton.setBounds(79, 182, 89, 23);
//		panel.add(btnNewButton);
//		
//		JLabel lblNewLabel_2 = new JLabel("Bem vindo");
//		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblNewLabel_2.setBounds(74, 11, 99, 14);
//		panel.add(lblNewLabel_2);
//		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(42, 132, 160, 23);
//		panel.add(passwordField);
	}
}
