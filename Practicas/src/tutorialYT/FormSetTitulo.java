package tutorialYT;

import javax.swing.*;
import java.awt.event.*;

public class FormSetTitulo extends JFrame implements ActionListener {
	
	private JTextField textField1;
	private JButton boton1;
	private JLabel label1;
	
	public FormSetTitulo() {
		
		setLayout(null);
		
		label1 = new JLabel("Usuario:");
		label1.setBounds(10,10,100,30);
		add(label1);
		
		textField1 = new JTextField();
		textField1.setBounds(120, 17, 150, 20);
		add(textField1);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(10, 80, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			String texto = textField1.getText();
			setTitle(texto);
		}
	}
	
	public static void main(String args[]) {
		FormSetTitulo formulario = new FormSetTitulo();
		formulario.setBounds(0, 0, 300, 150);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}

}
