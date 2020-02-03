package tutorialYT;

import javax.swing.*;
import javax.swing.event.*;

public class FormCheckbox extends JFrame implements ChangeListener {

	private JCheckBox checkbox1, checkbox2, checkbox3;
	
	public FormCheckbox() {
		setLayout(null);
		
		checkbox1 = new JCheckBox("Inglés");
		checkbox1.setBounds(10,10,150,30);
		checkbox1.addChangeListener(this);
		add(checkbox1);
		
		checkbox2 = new JCheckBox("Francés");
		checkbox2.setBounds(10, 50, 150, 30);
		checkbox2.addChangeListener(this);
		add(checkbox2);
		
		
		checkbox3 = new JCheckBox("Alemán");
		checkbox3.setBounds(10, 90, 150, 30);
		checkbox3.addChangeListener(this);
		add(checkbox3);
	}
	
	public void stateChanged(ChangeEvent e) {
		String cadena = "";
		
		if(checkbox1.isSelected() == true) {
			cadena = cadena + "Inglés -";
		}
		
		if(checkbox2.isSelected() == true) {
			cadena = cadena + "Francés -";
		}
		if(checkbox3.isSelected() == true) {
			cadena = cadena + "Alemán -";
		}
		
		setTitle(cadena);
	}
	
	public static void main(String args[]) {
		FormCheckbox formulario = new FormCheckbox();
		formulario.setBounds(0, 0, 450, 200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
	
}
