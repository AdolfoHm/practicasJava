package tutorialYT;

import javax.swing.*;

public class FormFrame extends JFrame {

	public FormFrame() {
		setLayout(null);
	}
	
	public static void main(String args[]) {
		FormFrame formulario2 = new FormFrame();
		formulario2.setResizable(false);
		formulario2.setVisible(true);
		formulario2.setLocationRelativeTo(null);
		formulario2.setBounds(0, 0, 400, 550);
	}
}
