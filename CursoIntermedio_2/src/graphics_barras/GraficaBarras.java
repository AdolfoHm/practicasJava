package graphics_barras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaBarras extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JTextField texto1, texto2, texto3;
	private JButton botonGraficar;

	boolean bandera = false;

	public GraficaBarras() {

		setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Gráfica de Barras");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		etiqueta1 = new JLabel("Rojo");
		etiqueta1.setBounds(30, 195, 50, 30);
		add(etiqueta1);

		texto1 = new JTextField();
		texto1.setBounds(80, 200, 80, 25);
		add(texto1);

		etiqueta2 = new JLabel("Verde");
		etiqueta2.setBounds(30, 235, 50, 30);
		add(etiqueta2);

		texto2 = new JTextField();
		texto2.setBounds(80, 240, 80, 25);
		add(texto2);

		etiqueta3 = new JLabel("Azul");
		etiqueta3.setBounds(30, 275, 50, 30);
		add(etiqueta3);

		texto3 = new JTextField();
		texto3.setBounds(80, 280, 80, 25);
		add(texto3);

		botonGraficar = new JButton("Graficar");
		botonGraficar.setBounds(300, 240, 100, 30);
		botonGraficar.addActionListener(this);
		add(botonGraficar);

	}

	public static void main(String[] args) {

		GraficaBarras ventana = new GraficaBarras();
		ventana.setBounds(0, 0, 550, 350);
		ventana.setResizable(false);
		ventana.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonGraficar) {
			bandera = true;
			repaint();
		}
	}

	public int MayorValor(int valorRojo, int valorVerde, int valorAzul) {
		if (valorRojo > valorVerde && valorRojo > valorAzul) {
			return valorRojo;
		} else if (valorVerde > valorAzul) {
			return valorVerde;
		} else {
			return valorAzul;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (bandera == true) {

			String stringRojo = texto1.getText();
			String stringVerde = texto2.getText();
			String stringAzul = texto3.getText();

			int intRojo = Integer.parseInt(stringRojo);
			int intVerde = Integer.parseInt(stringVerde);
			int intAzul = Integer.parseInt(stringAzul);

			int valorMayor = MayorValor(intRojo, intVerde, intAzul);

			int largoRojo = intRojo * 400 / valorMayor;
			int largoVerde = intVerde * 400 / valorMayor;
			int largoAzul = intAzul * 400 / valorMayor;

			g.setColor(new Color(255, 0, 0));
			g.drawString("Color Rojo", 10, 75);
			g.fillRect(100, 50, largoRojo, 40);

			g.setColor(new Color(0, 130, 0));
			g.drawString("Color Verde", 10, 125);
			g.fillRect(100, 100, largoVerde, 40);

			g.setColor(new Color(0, 0, 255));
			g.drawString("Color Azul", 10, 175);
			g.fillRect(100, 150, largoAzul, 40);

		}

	}

}
