package tutorialYT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormMenu extends JFrame implements ActionListener {
	
	private JMenuBar menubar;
	private JMenu menu1, menu2;
	private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
	
	public FormMenu() {
		setLayout(null);
		setTitle("FormMenu");
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu1 = new JMenu("Opciones");
		menubar.add(menu1);
		
		menu2 = new JMenu("Prueba");
		menubar.add(menu2);
		
		menuitem1 = new JMenuItem("Rojo");
		menuitem1.addActionListener(this);
		menu1.add(menuitem1);
		
		menuitem2 = new JMenuItem("Verde");
		menuitem2.addActionListener(this);
		menu1.add(menuitem2);
		
		menuitem3 = new JMenuItem("Azul");
		menuitem3.addActionListener(this);
		menu1.add(menuitem3);
		
		menuitem4 = new JMenuItem("Limpiar");
		menuitem4.addActionListener(this);
		menu1.add(menuitem4);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Container fondo = this.getContentPane();
		
		if(e.getSource() == menuitem1) {
			fondo.setBackground(new Color(255,0,0));
		}
		
		if(e.getSource() == menuitem2) {
			fondo.setBackground(new Color(0,255,0));
		}
		
		if(e.getSource() == menuitem3) {
			fondo.setBackground(new Color(0,0,255));
		}
		
		if(e.getSource() == menuitem4) {
			fondo.setBackground(new Color(255,255,255));
		}
	}
	
	public static void main(String args[]) {
		FormMenu formulario1 = new FormMenu();
		formulario1.setBounds(0, 0, 400, 300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}

}
