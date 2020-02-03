/*
 * Creado por Adolfo
 * Version 1.0
 * Creado el 11 de Enero 2020
 * 
 * Este programa recive una cadena de texto y la devuelve con el
 * orden de los caracteres invertidos
*/

package practicas;

import java.util.Scanner;

public class InversorPalabra {
	
	public static void main(String args[]) {
		
		String palabra = "";
		int longitud = 0;
		String palabraInvertida = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese texto:");
		palabra = entrada.nextLine();
		
		//Metodo para conocer la longitud de la cadena recibida.
		longitud = palabra.length();
		
		while(longitud != 0) {
			palabraInvertida += palabra.substring(longitud - 1, longitud);
			longitud--;
		}

		System.out.println("Palabra Invertida: " + palabraInvertida);		
		System.out.println("\n");
	}

}
