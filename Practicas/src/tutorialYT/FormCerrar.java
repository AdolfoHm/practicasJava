package tutorialYT;

import javax.swing.*;
import java.awt.event.*;

public class FormCerrar extends JFrame implements ActionListener{

//Se crea botón
	JButton boton1;
	public FormCerrar() {
		setLayout(null);
		boton1 = new JButton("Cerrar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
// Se crea evento
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.exit(0);
		}
	}
	
//Diseño interfaz gráfica
	public static void main(String args[]) {
		FormCerrar formulario = new FormCerrar();
		formulario.setBounds(0,0,450,350);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
	
}
