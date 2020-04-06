package lista_tipo_pila_analizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interfaz extends JFrame implements ActionListener {
	
	private JTextField textField1;
	private JButton botonValidar, botonCerrar;
	
	Interfaz(){
		
		setLayout(null);
		setTitle("Analizador Sintáctico");
		
		textField1 = new JTextField();
		textField1.setBounds(10,10,250,30);
		add(textField1);
		
		botonValidar = new JButton("Validar");
		botonValidar.setBounds(20, 70, 100, 30);
		botonValidar.addActionListener(this);
		add(botonValidar);
		
		botonCerrar = new JButton("Cerrar");
		botonCerrar.setBounds(130,70,100,30);
		botonCerrar.addActionListener(this);
		add(botonCerrar);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == botonValidar) {
			if (ValidarExpresion()) {
				JOptionPane.showMessageDialog(null, "La formula esta escrita correctamente.");
			} else {
				JOptionPane.showMessageDialog(null, "ERROR!, la formulo no esta escrita correctamente.");
			}
		}
		
		if (e.getSource() == botonCerrar) {
			System.exit(0);
		}

	}
	
	public static void main(String args[]) {

		Interfaz pantalla = new Interfaz();
		pantalla.setBounds(0, 0, 300, 150);
		pantalla.setVisible(true);
		pantalla.setResizable(false);
		pantalla.setLocationRelativeTo(null);

	}
	
	public boolean ValidarExpresion() {

		Pila pila = new Pila();
		String cadena = textField1.getText();

		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
				pila.Insertar(cadena.charAt(i));

			} else {
				
				if (cadena.charAt(i) == ')') {
					
					if (pila.Extraer() != '(') {
						
						return false;
						
					}

				} else {
					
					if (cadena.charAt(i) == ']') {
						
						if (pila.Extraer() != '[') {
							
							return false;
							
						}

					} else {
						
						if (cadena.charAt(i) == '}') {
							
							if (pila.Extraer() != '{') {
								
								return false;
								
							}
						}
					}
				}
			}

		}
		
		return pila.PilaVacia();
	}
	
	
}
