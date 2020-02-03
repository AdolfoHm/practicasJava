package ProyectoFin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {
	
	private JLabel label1, label2, logo;
	private JTextField nombre;
	private JButton ingresar;
	public static String nombreEmp = "";
	
	public Bienvenida() {
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		
//Se pueden reemplazar estas dos lineas con la siguiente
//		Container fondo = this.getContentPane();
//		fondo.setBackground(new Color (250,0,0));
		getContentPane().setBackground(new Color(255,0,0));

//Esta línea va cuando la imagen la tienes en la misma ruta que el programa
//		setIconImage(new ImageIcon(getClass().getResource("images\icon.png")).getImage());
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\skalo\\Pictures\\images\\icon.png");    
		setIconImage(icon);
		
		label1 = new JLabel("Sistema de Control Vacacional");
		label1.setBounds(50, 70, 300, 30);
		label1.setFont(new Font("Andale Mono", 3, 20));
		label1.setForeground(new Color(255,255,255));
		add(label1);
		
		ImageIcon imagen = new ImageIcon("C:/Users/skalo/Pictures/images/logo-coca.png");
		logo = new JLabel(imagen);
		logo.setBounds(70, 70, 250, 200);
		add(logo);
				
		label2 = new JLabel("Ingrese su Nombre:");
		label2.setBounds(20, 250, 160, 40);
		label2.setFont(new Font("Andale Mono", 3, 15));
		label2.setForeground(new Color(255,255,255));
		add(label2);
		
		nombre = new JTextField();
		nombre.setBounds(20,290, 360, 30);
		nombre.setBackground(new Color(224,224,244));
		nombre.setFont(new Font("Courier", 2, 18));
		nombre.setForeground(new Color(255,0,0));
		add(nombre);
		
		ingresar = new JButton("Ingresar");
		ingresar.setBounds(150, 370, 100, 35);
		ingresar.setToolTipText("De clic para continuar");
		ingresar.setFont(new Font("Andale Mono", 1, 15));
		ingresar.setForeground(new Color(255,0,0));
		ingresar.setBackground(new Color(255, 255, 255));
		ingresar.addActionListener(this);
		add(ingresar);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ingresar) {
			nombreEmp = nombre.getText().trim();
			
			if(nombreEmp.equals("")) {
				JOptionPane.showMessageDialog(null, "Debe ingersar un nombre.");
			} else {
				LicenciaUso ventanaLicencia = new LicenciaUso();
				ventanaLicencia.setBounds(0,0,800,600);
				ventanaLicencia.setVisible(true);
				ventanaLicencia.setResizable(false);
				ventanaLicencia.setLocationRelativeTo(null);
				this.setVisible(false);
			}
				
		}
	}
	
	public static void main(String agrs[]) {
		
		Bienvenida inicio = new Bienvenida();
		inicio.setBounds(0, 0, 400, 500);
		inicio.setVisible(true);
		inicio.setResizable(false);
		inicio.setLocationRelativeTo(null);
	}
	

}
