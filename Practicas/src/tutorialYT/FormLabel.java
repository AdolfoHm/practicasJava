package tutorialYT;

import javax.swing.*;

public class FormLabel extends JFrame{
	private JLabel label1;
	
	public FormLabel() {
		setLayout(null);
		label1 = new JLabel("La Geekipedia de Ernesto");
		label1.setBounds(50, 50, 200, 300);
		add(label1);
	}

	public static void main(String args[]) {
		FormLabel formulario1 = new FormLabel();
		formulario1.setBounds(0, 0, 400, 300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}
}
