package graphics_ventana;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Formas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		Formas ventana = new Formas();
		ventana.setBounds(0, 0, 600, 400);
		ventana.setResizable(false);
		ventana.setVisible(true);

//		java.awt.EventQueue.invokeLater(new Runnable() {
//
//			@Override
//			public void run() {
//				new Formas().setVisible(true);
//
//			}
//
//		});

	}

	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLUE);
		g.drawLine(100, 50, 120, 70);
		g.drawLine(120, 70, 200, 100);
		g.drawRect(150, 70, 50, 70);
		g.drawRoundRect(250, 70, 50, 70, 6, 6);
		g.drawOval(350, 70, 50, 70);
		
		int vectorX[] = {500,550,450};
		int vectorY[] = {70,120,120};
		g.drawPolygon(vectorX, vectorY, 3);
		
		g.setColor(Color.GREEN);
		g.fillRect(150, 270, 50, 70);
		g.fillRoundRect(250, 270, 50, 70, 6, 6);
		g.fillOval(350, 270, 50, 70);
		
		int vectorX2[] = {500,550,450};
		int vectorY2[] = {270,320,320};
		g.fillPolygon(vectorX2, vectorY2, 3);
	}

}
