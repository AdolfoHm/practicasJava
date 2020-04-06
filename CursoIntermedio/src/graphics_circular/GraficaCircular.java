package graphics_circular;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaCircular extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JTextField cajaTexto1, cajaTexto2, cajaTexto3;
	private JButton botonGraficar;
	
	public GraficaCircular() {
		
		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Gráfica Circular");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		etiqueta1 = new JLabel("Rojo");
		etiqueta1.setBounds(30, 350, 60, 30);
		add(etiqueta1);
		
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(90, 350, 80, 30);
		add(cajaTexto1);
		
		etiqueta2 = new JLabel("Verde");
		etiqueta2.setBounds(30, 390, 60, 30);
		add(etiqueta2);
		
		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(90, 390, 80, 30);
		add(cajaTexto2);
		
		etiqueta3 = new JLabel("Azul");
		etiqueta3.setBounds(30, 430, 60, 30);
		add(etiqueta3);
		
		cajaTexto3 = new JTextField();
		cajaTexto3.setBounds(90, 430, 80, 30);
		add(cajaTexto3);
		
		botonGraficar = new JButton("Graficar");
		botonGraficar.setBounds(270, 430, 90, 30);
		botonGraficar.addActionListener(this);
		add(botonGraficar);

	}
	
	boolean bandera = false;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonGraficar) {
			bandera = true;
			repaint();
		}
	}
	
	public static void main(String[] args) {
		GraficaCircular grafica = new GraficaCircular();
		grafica.setBounds(0, 0, 400, 600);
		grafica.setVisible(true);
		grafica.setResizable(false);		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		if (bandera == true) {

			String stringRojo = cajaTexto1.getText();
			String stringVerde = cajaTexto2.getText();
			String stringAzul = cajaTexto3.getText();

			int intRojo = Integer.parseInt(stringRojo);
			int intVerde = Integer.parseInt(stringVerde);
			int intAzul = Integer.parseInt(stringAzul);

			int totalVotos = intRojo + intVerde + intAzul;

			int gradosRojo = intRojo * 360 / totalVotos;
			int gradosVerde = (intVerde * 360) / totalVotos;
			int gradosAzul = (intAzul * 360) / totalVotos;

			g.setColor(new Color(255, 0, 0));
			g.fillArc(25, 80, 200, 200, 0, gradosRojo);
			g.fillRect(250, 120, 20, 20);
			g.drawString("Color Rojo", 275, 135);

			g.setColor(new Color(0, 130, 0));
			g.fillArc(25, 80, 200, 200, gradosRojo, gradosVerde);
			g.fillRect(250, 150, 20, 20);
			g.drawString("Color Verde", 275, 165);

			g.setColor(new Color(0, 0, 255));
			g.fillArc(25, 80, 200, 200, gradosRojo + gradosVerde, gradosAzul);
			g.fillRect(250, 180, 20, 20);
			g.drawString("Color Azul", 275, 195);

		}
	}

}
