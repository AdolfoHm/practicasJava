package tutorialYT;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class FormTerminos extends JFrame implements ActionListener, ChangeListener {
	
	private JLabel label1;
	private JCheckBox checkbox1;
	private JButton boton1;
	
	public FormTerminos() {
		setLayout(null);
		
		label1 = new JLabel("Aceptar Términos y Condiciones");
		label1.setBounds(10,10,400,30);
		add(label1);
		
		checkbox1 = new JCheckBox("Acepto");
		checkbox1.setBounds(10, 50, 100, 30);
		checkbox1.addChangeListener(this);
		add(checkbox1);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(10, 100, 100, 30);
		boton1.addActionListener(this);
		add(boton1);
		boton1.setEnabled(false);
		
	}
	
	public void stateChanged(ChangeEvent e) {
		
		if(checkbox1.isSelected() == true) {
			boton1.setEnabled(true);
		}else {
			boton1.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {		
		FormTerminos formulario = new FormTerminos();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}

}
