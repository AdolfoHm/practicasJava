package graphics_barra_porc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GraficaBarraPor extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JLabel etiqueta1, etiqueta2, etiqueta3;
	private JTextField texto1, texto2, texto3;
	private JButton botonGraficar;
	
	boolean bandera = false;
	
	public GraficaBarraPor() {
		
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
	
	public static void main(String args[]) {
		
		GraficaBarraPor ventana = new GraficaBarraPor();
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
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		String stringRojo = texto1.getText();
		String stringVerde = texto2.getText();
		String stringAzul = texto3.getText();
		
		int intRojo = Integer.parseInt(stringRojo);
		int intVerde = Integer.parseInt(stringVerde);
		int intAzul = Integer.parseInt(stringAzul);
		
		int total = intRojo + intVerde + intAzul;
		
		int largoRojo = intRojo * 400 / total;
		int largoVerde = intVerde * 400 / total;
		int largoAzul = intAzul * 400 / total;
		
		int porcRojo = intRojo * 100 / total;
		int porcVerde = intVerde * 100 / total;
		int porcAzul = intAzul * 100 / total;
		
		g.setColor(new Color(255,0,0));
		g.fillRect(50, 120, largoRojo, 50);
		g.setColor(new Color(255,255,255));
		g.drawString(porcRojo + "%", 55, 140);
		
		g.setColor(new Color(0,130,0));
		g.fillRect(50 + largoRojo, 120, largoVerde, 50);
		g.setColor(new Color(255,255,255));
		g.drawString(porcVerde + "%", 55 + largoRojo, 140);
		
		g.setColor(new Color(0,0,255));
		g.fillRect(50 + largoRojo + largoVerde, 120, largoAzul, 50);
		g.setColor(new Color(255,255,255));
		g.drawString(porcAzul + "%", 55 + largoRojo + largoAzul, 140);
	}

}
