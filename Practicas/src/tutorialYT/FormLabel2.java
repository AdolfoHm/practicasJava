package tutorialYT;

import javax.swing.*;

public class FormLabel2 extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	
	public FormLabel2() {
		setLayout(null);
		label1 = new JLabel("Interfaz gráfica");
		label1.setBounds(10, 20, 300, 30);
		add(label1);
		
		label2 = new JLabel("Versión 1.0");
		label2.setBounds(10, 100, 100, 30);
		add(label2);
	}
	
	public static void main(String args[]) {
		FormLabel2 formulario3 = new FormLabel2();
		formulario3.setVisible(true);
		formulario3.setResizable(false);
		formulario3.setLocationRelativeTo(null);
		formulario3.setBounds(0, 0, 300, 200);
	}

}
