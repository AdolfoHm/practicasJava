package tutorialYT;

import javax.swing.*;
import java.awt.event.*;

public class FormCombo extends JFrame implements ItemListener {
	
	private JComboBox combo1;
	
	public FormCombo() {
		setLayout(null);
		combo1 = new JComboBox();
		combo1.setBounds(10,10,80,20);
		add(combo1);
		
		combo1.addItem("Rojo");
		combo1.addItem("Verde");
		combo1.addItem("Azul");
		combo1.addItem("Amarillo");
		combo1.addItem("Negro");
		combo1.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == combo1) {
			String seleccion = combo1.getSelectedItem().toString();
			setTitle(seleccion);		}
	}
	
	public static void main(String args[]) {
		FormCombo formulario = new FormCombo();
		formulario.setBounds(0,0,300,150);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}

}
