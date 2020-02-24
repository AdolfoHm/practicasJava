package constructor;

import java.util.Scanner;

public class SinConstructor {
	
	private Scanner mensajero = new Scanner(System.in);
	String nombre = "";
	
	public void perdirNombre() {
		System.out.println("Cual es tu nombre ?");
		nombre = mensajero.nextLine();
		
	}

	public void imprimir() {
		System.out.println("Tu nombre es : " + nombre);
	}
}
