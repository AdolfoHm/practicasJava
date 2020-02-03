package tutorialYT;

import javax.swing.*;
import java.awt.event.*;

public class PracInterfaz extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta1, etiqueta2;
	private JButton botonAceptar, botonCerrar;
	private JTextField cajaTexto1, cajaTexto2;
	private JTextArea areaTexto1;
	
	String resultado = "";
	
	PracInterfaz() {
		setLayout(null);
		setTitle("Práctica");

		etiqueta1 = new JLabel("Primer Número:");
		etiqueta1.setBounds(10, 10, 110, 40);
		add(etiqueta1);

		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(130, 20, 50, 20);
		add(cajaTexto1);

		etiqueta2 = new JLabel("Segundo Número:");
		etiqueta2.setBounds(10, 50, 110, 40);
		add(etiqueta2);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(130, 60, 50, 20 );
		add(cajaTexto2);
		
		areaTexto1 = new JTextArea();
		areaTexto1.setBounds(10, 110, 200, 200);
		add(areaTexto1);

		botonCerrar = new JButton("Cerrar");
		botonCerrar.setBounds(250, 300, 80, 30);
		botonCerrar.addActionListener(this);
		add(botonCerrar);
		
		
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(250, 250, 80, 30);
		botonAceptar.addActionListener(this);
		add(botonAceptar);
		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botonAceptar) {
			int suma = Integer.parseInt((cajaTexto1.getText())) + Integer.parseInt(cajaTexto2.getText());
			String sumatoria = Integer.toString(suma);
			
			resultado += sumatoria + "\n";
			areaTexto1.setText(resultado);
			
			cajaTexto1.setText("");
			cajaTexto2.setText("");
		}
		
		if (e.getSource() == botonCerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		
		PracInterfaz practica = new PracInterfaz();
		practica.setBounds(0,0,350,400);
		practica.setVisible(true);
		practica.setResizable(false);
		practica.setLocationRelativeTo(null);
			
		}
	}

