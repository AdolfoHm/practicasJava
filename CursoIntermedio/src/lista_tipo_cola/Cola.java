package lista_tipo_cola;

import javax.swing.JOptionPane;

public class Cola {
	
	private Nodo inicioCola, finalCola;
	String cola = "";
	
	public Cola() {
		inicioCola = null;
		finalCola = null;
	}
	// Metodo para validar si la cola esta vacía
	public boolean ColaVacia() {
		
		if (inicioCola == null) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para insertar un nodo en la cola
	public void Insertar(int informacion) {
		Nodo nuevoNodo = new Nodo();
		
		nuevoNodo.informacion = informacion;
		nuevoNodo.siguiente = null;
		
		if (ColaVacia()) {
			inicioCola = nuevoNodo;
			finalCola = nuevoNodo;
		} else {
			finalCola.siguiente = nuevoNodo;
			finalCola = nuevoNodo;
		}
	}
	
	// Método para recuperar un nodo de la cola
	public int Extraer() {
		if (!ColaVacia()) {
			
			int informacion = inicioCola.informacion;
			
			if (inicioCola == finalCola) {
				inicioCola = null;
				finalCola = null;
			} else {
				inicioCola = inicioCola.siguiente;
				
			}
			return informacion;
		} else {
			return Integer.MAX_VALUE;
		}
	}
	
	// Método para devolver el contenido de la cola
	public void MostrarContenido() {
		
		Nodo recorrido = inicioCola;
		String colaInvertida = "";
		
		while(recorrido != null) {
			cola += recorrido.informacion + " ";
			recorrido = recorrido.siguiente;
		}
		
		String cadena[] = cola.split(" ");
		
		for (int i = cadena.length - 1; i >= 0; i--) {
			colaInvertida += " " + cadena[i];
		}
		
		JOptionPane.showMessageDialog(null, colaInvertida);
		cola = "";
	}

}
