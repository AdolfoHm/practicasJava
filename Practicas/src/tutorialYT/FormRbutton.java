package tutorialYT;

import javax.swing.*;
import javax.swing.event.*;

public class FormRbutton extends JFrame implements ChangeListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bg;
	
	public FormRbutton() {
		setLayout(null);
		
		bg = new ButtonGroup();
		
		radio1 = new JRadioButton("640 x 480");
		radio1.setBounds(10, 20, 100, 30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);
		
		radio2 = new JRadioButton("800 x 600");
		radio2.setBounds(10, 70, 100, 30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);
		
		radio3 = new JRadioButton("1024 x 768");
		radio3.setBounds(10, 120, 100, 30);
		radio3.addChangeListener(this);
		add(radio3);
		bg.add(radio3);
	}
	
	public void stateChanged(ChangeEvent e) {
		
		if(radio1.isSelected() == true) {
			setSize(640,480);
		}
		if(radio2.isSelected() == true) {
			setSize(800,600);
		}
		if(radio3.isSelected() == true) {
			setSize(1024,769);
		}
	}
	
	public static void main(String args[]) {
		
		FormRbutton formulario = new FormRbutton();
		formulario.setBounds(0, 0, 350, 230);
		formulario.setVisible(true);
		formulario.setResizable(false);
	}

}
