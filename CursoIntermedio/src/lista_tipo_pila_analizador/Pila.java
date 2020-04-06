package lista_tipo_pila_analizador;

public class Pila {
	
	private Nodo ultimoValorIngresado;
	
	public Pila() {
		ultimoValorIngresado = null;
	}
	
	// M�todo que inserta un valor a la pila
	public void Insertar(char valor) {
		Nodo nuevo_nodo = new Nodo();
		nuevo_nodo.informaci�n = valor;

		if (ultimoValorIngresado == null) {
			
			nuevo_nodo.siguiente = null;
			ultimoValorIngresado = nuevo_nodo;
			
		} else {
			
			nuevo_nodo.siguiente = ultimoValorIngresado;
			ultimoValorIngresado = nuevo_nodo;
			
		}
	}
	
	// M�todo que recupera un valor de la pila
	public char Extraer() {
		
		if (ultimoValorIngresado != null) {
			
			char informacion = ultimoValorIngresado.informaci�n;
			ultimoValorIngresado = ultimoValorIngresado.siguiente;
			return informacion;
			
		} else {
			
			return Character.MAX_VALUE;
			
		}
	}
	
	// M�todo para saber si la fila esta vac�a
	public boolean PilaVacia() {
		return ultimoValorIngresado == null;
	}

}
