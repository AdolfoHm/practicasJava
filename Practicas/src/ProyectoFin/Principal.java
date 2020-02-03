package ProyectoFin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame implements ActionListener {
	
	private JMenuBar menu;
	private JMenu menuOpciones, menuCalcular, menuAcerca, menuColor;
	private JMenuItem menuNuevo, menuSalir, menuColor1, menuColor2, menuColor3, menuVacaciones, menuCreador;
	
	private JLabel logo, bienvenida, subTitulo, nombre, apePat, apeMat, depto, antiguedad, resultado, labelFooter;
	private JTextField textNombre, textPaterno, textMaterno;
	private JScrollPane scrollPane1;
	private JTextArea textArea;
	private JComboBox comboDepto, comboAntiguedad;
	String nombreAdministrador = "";
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\skalo\\Pictures\\images\\icon.png");
		setIconImage(icon);
		nombreAdministrador = Bienvenida.nombreEmp;

		//Sentencias para menus
		menu = new JMenuBar();
		setJMenuBar(menu);
		menu.setBackground(new Color(255, 0, 0));		
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setFont(new Font("Andale Mono", 1, 15));
		menuOpciones.setBackground(new Color(255, 0, 0));
		menuOpciones.setForeground(new Color(255, 255, 255));
		menu.add(menuOpciones);
				
		menuColor = new JMenu("Color de Fondo");
		menuColor.setFont(new Font("Andale Mono", 1, 15));
		menuColor.setBackground(new Color(255,0 ,0 ));
		menuColor.setForeground(new Color(255, 255, 255));
		menuOpciones.add(menuColor);
		
		menuColor1 = new JMenuItem("Rojo");
		menuColor1.setFont(new Font("Andale Mono", 1, 15));
		menuColor1.setBackground(new Color(255,0 ,0 ));
		menuColor1.setForeground(new Color(255, 255, 255));
		menuColor1.addActionListener(this);
		menuColor.add(menuColor1);
		
		menuColor2 = new JMenuItem("Verde");
		menuColor2.setFont(new Font("Andale Mono", 1, 15));
		menuColor2.setBackground(new Color(255,0 ,0 ));
		menuColor2.setForeground(new Color(255, 255, 255));
		menuColor2.addActionListener(this);
		menuColor.add(menuColor2);
		
		menuColor3 = new JMenuItem("Azul");
		menuColor3.setFont(new Font("Andale Mono", 1, 15));
		menuColor3.setBackground(new Color(255,0 ,0 ));
		menuColor3.setForeground(new Color(255, 255, 255));
		menuColor3.addActionListener(this);
		menuColor.add(menuColor3);
		
		menuNuevo = new JMenuItem("Nuevo");
		menuNuevo.setFont(new Font("Andale Mono", 1, 15));
		menuNuevo.setBackground(new Color(255,0 ,0 ));
		menuNuevo.setForeground(new Color(255, 255, 255));
		menuNuevo.addActionListener(this);
		menuOpciones.add(menuNuevo);
		
		menuSalir = new JMenuItem("Salir");
		menuSalir.setFont(new Font("Andale Mono", 1, 15));
		menuSalir.setBackground(new Color(255,0 ,0 ));
		menuSalir.setForeground(new Color(255, 255, 255));
		menuSalir.addActionListener(this);
		menuOpciones.add(menuSalir);
		
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setFont(new Font("Andale Mono", 1, 15));
		menuCalcular.setBackground(new Color(255, 0, 0));
		menuCalcular.setForeground(new Color(255, 255, 255));
//		menuCalcular.addActionListener(this);
		menu.add(menuCalcular);
		
		menuVacaciones = new JMenuItem("Vacaciones");
		menuVacaciones.setFont(new Font("Andale Mono", 1, 15));
		menuVacaciones.setBackground(new Color(255,0 ,0 ));
		menuVacaciones.setForeground(new Color(255, 255, 255));
		menuVacaciones.addActionListener(this);
		menuCalcular.add(menuVacaciones);
		
		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setFont(new Font("Andale Mono", 1, 15));
		menuAcerca.setBackground(new Color(255, 0, 0));
		menuAcerca.setForeground(new Color(255, 255, 255));
		
		menuCreador = new JMenuItem("Creador");
		menuCreador.setFont(new Font("Andale Mono", 1, 15));
		menuCreador.setBackground(new Color(255, 0, 0));
		menuCreador.setForeground(new Color(255, 255, 255));
		menuCreador.addActionListener(this);
		menuAcerca.add(menuCreador);
		menu.add(menuAcerca);
		
		//Poner icono a la ventana
		ImageIcon imagen = new ImageIcon("C:/Users/skalo/Pictures/images/logo-coca.png");
		logo = new JLabel(imagen);
		logo.setBounds(0,0,300,150);
		add(logo);
		
		//Inicia diseno de pantalla
		bienvenida = new JLabel("Bienvenido " + nombreAdministrador);
		bienvenida.setBounds(400, 50, 300, 100);
		bienvenida.setFont(new Font("Andale Mono", 1,35));
		bienvenida.setForeground(new Color(255,255,255));
		add(bienvenida);
		
		subTitulo = new JLabel("Datos del trabajador para cálculo de vacaciones");
		subTitulo.setBounds(50, 200, 700, 50);
		subTitulo.setFont(new Font("Andale Mono", 0, 30));
		subTitulo.setForeground(new Color(255,255,255));
		add(subTitulo);
		
		nombre = new JLabel("Nombre Completo:");
		nombre.setBounds(30, 300, 200, 30);
		nombre.setFont(new Font("Andale Mono", 1, 16));
		nombre.setForeground(new Color(255,255,255));
		add(nombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(30, 340, 350, 30);
		textNombre.setFont(new Font("Andale Mono", 1,16));
		textNombre.setBackground(new Color(220,220,220));
		textNombre.setForeground(new Color(255,0,0));
		add(textNombre);
		
		apePat = new JLabel("Apellido Paterno:");
		apePat.setBounds(30, 420, 200, 30);
		apePat.setFont(new Font("Andale Mono", 1,16));
		apePat.setForeground(new Color(255,255,255));
		add(apePat);
		
		textPaterno = new JTextField();
		textPaterno.setBounds(30, 460, 350, 30);
		textPaterno.setFont(new Font("Andale Mono", 1,16));
		textPaterno.setBackground(new Color(220,220,220));
		textPaterno.setForeground(new Color(255,0,0));
		add(textPaterno);
		
		apeMat = new JLabel("Apellido Materno:");
		apeMat.setBounds(30, 540, 200, 30);
		apeMat.setFont(new Font("Andale Mono", 1,16));
		apeMat.setForeground(new Color(255,255,255));
		add(apeMat);
		
		textMaterno = new JTextField();
		textMaterno.setBounds(30,580,350,30);
		textMaterno.setFont(new Font("Andale Mono", 1,16));
		textMaterno.setBackground(new Color(220,220,220));
		textMaterno.setForeground(new Color(255,0,0));
		add(textMaterno);
		
		depto = new JLabel("Selecciona el Departamento:");
		depto.setBounds(400, 300, 300, 30);
		depto.setFont(new Font("Andale Mono", 1, 16));
		depto.setForeground(new Color(255,255,255));
		add(depto);
		
		comboDepto = new JComboBox();
		comboDepto.setBounds(400, 340, 300, 30);
		comboDepto.addItem("");
		comboDepto.addItem("Atencion al Cliente");
		comboDepto.addItem("Departamento de Logistica");
		comboDepto.addItem("Departamento de Gerencia");
		add(comboDepto);
		
		antiguedad = new JLabel("Selecciona la Antigüedad:");
		antiguedad.setBounds(400, 420, 300, 30);
		antiguedad.setFont(new Font("Andale Mono", 1, 16));
		antiguedad.setForeground(new Color(255, 255, 255));
		add(antiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(400, 460, 300, 30);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años");
		comboAntiguedad.addItem("7 años o más de servicio");
		add(comboAntiguedad);
		
		resultado = new JLabel("Resultado del cálculo:");
		resultado.setBounds(400, 540, 300, 30);
		resultado.setFont(new Font("Andale Mono", 1, 16));
		resultado.setForeground(new Color(255, 255, 255));
		add(resultado);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Andale Mono", 1, 13));
		textArea.setBackground(new Color(220, 220, 220));
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setText("\n    Aqui aparece el resultado del" +
		                 "\n    calculo de las vacaciones.");
		scrollPane1 = new JScrollPane(textArea);
		scrollPane1.setBounds(400, 580, 500, 200);
		add(scrollPane1);
		
		labelFooter = new JLabel("© 2017 The Coca Cola Company | Todos los Derechos Reservados");
		labelFooter.setBounds(200, 800, 600, 20);
		labelFooter.setFont(new Font("Andale Mono", 0, 12));
		labelFooter.setForeground(new Color(255, 255, 255));
		add(labelFooter);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuVacaciones) {
			String nombreTrabajador = textNombre.getText();
			String apePat = textPaterno.getText();
			String apeMat = textMaterno.getText();
			String depto = comboDepto.getSelectedItem().toString();
			String antiguedad = comboAntiguedad.getSelectedItem().toString();
			
			if(nombreTrabajador.equals("") || apePat.equals("") || apeMat.equals("") ||
			   depto.contentEquals("") || antiguedad.equals("")) {
				
				JOptionPane.showMessageDialog(null, "Debe informar todos los campos.");
				
			} else {
				if(depto.equals("Atencion al Cliente")) {
					if(antiguedad.equals("1 año de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 6 dias de vacaciones.");
					}
					if(antiguedad.equals("2 a 6 años")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 14 dias de vacaciones.");
					}
					if(antiguedad.equals("7 años o más de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 20 dias de vacaciones.");
					}
				}
				
				//Depatamento de Logistica
				if(depto.equals("Departamento de Logistica")) {
					if(antiguedad.equals("1 año de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 7 dias de vacaciones.");
					}
					if(antiguedad.equals("2 a 6 años")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 15 dias de vacaciones.");
					}
					if(antiguedad.equals("7 años o más de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 22 dias de vacaciones.");
					}
				}
				//Departamento de Gerencia
				if(depto.equals("Departamento de Gerencia")) {
					if(antiguedad.equals("1 año de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 10 dias de vacaciones.");
					}
					if(antiguedad.equals("2 a 6 años")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 20 dias de vacaciones.");
					}
					if(antiguedad.equals("7 años o más de servicio")) {
						textArea.setText("\n  El trabajador " + nombreTrabajador + " " + apePat + " " + apeMat +
								         "\n   quien labora en " + depto + " " + "con " + antiguedad +
								         "\n   recibe 30 dias de vacaciones.");
					}
				}
			}
			
		}
		if(e.getSource() == menuColor1) {
			this.getContentPane().setBackground(new Color(255, 0, 0));
		}
		if(e.getSource() == menuColor2) {
			this.getContentPane().setBackground(new Color(0, 255, 0));
		}
		if(e.getSource() == menuColor3) {
			this.getContentPane().setBackground(new Color(0, 0, 255));
		}
		if(e.getSource() == menuSalir) {
			Bienvenida inicio = new Bienvenida();
			inicio.setBounds(0, 0, 400, 500);
			inicio.setVisible(true);
			inicio.setResizable(false);
			inicio.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == menuNuevo) {
			textNombre.setText("");
			textPaterno.setText("");
			textMaterno.setText("");
			comboDepto.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textArea.setText("\n    Aqui aparece el resultado del" +
	                         "\n    calculo de las vacaciones.");
		}
		if(e.getSource() == menuCreador) {
			JOptionPane.showMessageDialog(null, "Fito se rifo este programa.");
		}
	}
	
	public static void main(String args[]) {
		
		Principal formulario = new Principal();
		formulario.setBounds(0, 0, 950, 900);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}

}
