package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
	
	private Nodo ultimoValorIngresado;
	int tamano = 0;
	String Lista = "";
	
	public Pila() {
		ultimoValorIngresado = null;
		tamano = 0;
	}
	
	//Metodo para saber cuando una pila esta vacia
	public boolean PilaVacia() {
		return ultimoValorIngresado == null;
	}
	
	//Metodo para insertar un nodo en la pila
	public void InsertarNodo(int nodo) {
		Nodo nuevoNodo = new Nodo(nodo);
		nuevoNodo.siguiente = ultimoValorIngresado;
		ultimoValorIngresado = nuevoNodo;
		tamano++;
	}
	
	//Metodo para eliminar un nodo en la pila
	public int EliminarNodo() {
		int auxiliar = ultimoValorIngresado.informacion;
		ultimoValorIngresado = ultimoValorIngresado.siguiente;
		tamano--;
		return auxiliar;
	}
	
	//Metodo para conocer cual es el ultimo valor ingresado
	public int MostrarUltimoValorIngresado() {
		return ultimoValorIngresado.informacion;
	}
	
	//Metodo para conocer el tamano de la lista
	public int TamanoPila() {
		return tamano;
	}
	
	//Metodo para vaciar la pila
	public void VaciarPila() {
		while(!PilaVacia()) {
			EliminarNodo();
		}
	}
	
	//Metodo para devolver contenido de la pila
	public void MostrarValores() {
		Nodo recorrido = ultimoValorIngresado;
		
		while(recorrido != null ) {
			Lista += recorrido.informacion + "\n";
			recorrido = recorrido.siguiente;
		}
		
		JOptionPane.showMessageDialog(null, Lista);
		Lista = "";
	}
}
