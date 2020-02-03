package ProyectoFin;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LicenciaUso extends JFrame implements ActionListener, ChangeListener {
	
	private JLabel label1, logo;
	private JTextArea textArea1;
	private JScrollPane scrollPane1;
	private JCheckBox check1;
	private JButton boton1, boton2;
	String nombre = "";
	
	public LicenciaUso() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de Uso");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\skalo\\Pictures\\images\\icon.png");    
		setIconImage(icon);
//		Bienvenida ventBienvenida = new Bienvenida();
		nombre = Bienvenida.nombreEmp;
		
		label1 = new JLabel("TÉRMINOS Y CONDICIONES");
		label1.setBounds(275, 20, 300, 30);
		label1.setFont(new Font("Andale Mono", 1, 18));
		label1.setForeground(new Color(0,0,0));
		add(label1);
		
		textArea1 = new JTextArea();
		textArea1.setEditable(false); // Para que el texto no pueda ser editado
		textArea1.setFont(new Font("Courier", 0, 12));
		textArea1.setText("\n\n     TÉRMINOS Y CONDICIONES" +
		                  "\n\n             A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE FITO" +
				          "\n             B. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑP DE LAS INTERFACES GRÁFICAS" +
		                  "\n             C. FITO NO SE HACE RESPONSABLE POR EL MAL USO DE ESTE SOFTWARE." + 
				          "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
		                  "\n          (FITO Y EL AUTOR), NO SE HACEN RESPONSABLES DEL USO QUE USTED HAGA CON ESTE SOFTWARE" +
				          "\n          Y SUS TÉRMINOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (YO ACEPTO), SI USTED NO ACEPTA" +
		                  "\n          ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
				          "\n\n          PARA MAYOR INFORMACIÓN SOBRES NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE:" +
		                  "\n          www.tumeropadre.com");
		scrollPane1 = new JScrollPane(textArea1);
		scrollPane1.setBounds(20, 70, 750, 350);
		add(scrollPane1);
		
		check1 = new JCheckBox("Yo " + nombre + " Acepto");
//		check1.setFont(new Font("Andale Mono", 1 ,15));
		check1.setBounds(25, 430, 200, 30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(25, 480, 100, 40);
		boton1.setEnabled(false);
		boton1.addActionListener(this);
		add(boton1);
		
		boton2 = new JButton("No Acepto");
		boton2.setBounds(150, 480, 100, 40);
		boton2.setEnabled(true);
		boton2.addActionListener(this);
		add(boton2);
		
		ImageIcon imagen = new ImageIcon("C:/Users/skalo/Pictures/images/coca-cola.png");
		JLabel logo = new JLabel(imagen);
		logo.setBounds(530, 380, 250, 200);
		add(logo);
			
	}
	
	public void stateChanged(ChangeEvent e) {
		
		if(check1.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		} else {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			Principal formulario = new Principal();
			formulario.setBounds(0, 0, 950, 900);
			formulario.setVisible(true);
			formulario.setResizable(false);
			formulario.setLocationRelativeTo(null);
			this.setVisible(false);
		} else if(e.getSource() == boton2){
			Bienvenida inicio = new Bienvenida();
			inicio.setBounds(0, 0, 400, 500);
			inicio.setVisible(true);
			inicio.setResizable(false);
			inicio.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
	
	public static void main(String args[]) {
		
		LicenciaUso ventanaLicencia = new LicenciaUso();
		ventanaLicencia.setBounds(0,0,800,600);
		ventanaLicencia.setVisible(true);
		ventanaLicencia.setResizable(false);
		ventanaLicencia.setLocationRelativeTo(null);
			
	}
	

}
