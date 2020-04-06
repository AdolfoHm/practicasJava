package lista_tipo_cola;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String args[]) {

		int opcion = 0, nodoInformacion = 0;
		Cola cola = new Cola();

		do {

			try {
				
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Menú de Opciones \n\n"
						+ "1. Insertar un nodo \n"
						+ "2. Extraer un noco \n"
						+ "3. Mostrar contenido de la cola\n"
						+ "4. Salir.\n\n"));
				
				switch(opcion) {
				case 1:
					nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Por favor ingresa el valor a guardar en el nodo:"));
					cola.Insertar(nodoInformacion);
					break;
				case 2:
					if (!cola.ColaVacia()) {
						JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
								+ cola.Extraer());
					} else {
						JOptionPane.showMessageDialog(null, "La cola está vacía.");
					}
					break;
				case 3:
					cola.MostrarContenido();
					break;
				case 4:
					opcion = 4;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no disponible.");
					break;
				}

			} catch (NumberFormatException e) {
				

			}
		} while (opcion != 4);
	}

}
