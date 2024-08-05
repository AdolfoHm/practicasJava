package com.curso;

public class Condiciones {

	public static void main(String[] args) {
		
		int edad = 20;
		String pais = "Canada";
		
		if ((pais.equals("Mexico") && edad >= 18) || (pais.equals("USA") && edad >= 21))
			System.out.print("Sí es mayor de edad.");
		else
			System.out.print("No es mayor de edad o el país no es reconocido.");
		
		System.out.print("\n");
		String salida = edad >= 18 ? "Es mayor de edad" : "No es mayor de edad";
		System.out.print(salida);
		System.out.print("\n");
		
		int dia = 2;
		
		switch(dia) {
			case 1:
			case 2:
			case 3:
				System.out.print("Primera mitad de la semana");
				break;
			
			case 4:
				System.out.print("Mitad de la semana");
				break;
			
			case 5:
			case 6:
			case 7 :
				System.out.print("Segunda mitad de la semana");
				break;
			default:
				System.out.print("El día no es válido");
		}
		
		
		System.out.print("\n");
		System.out.print("Fin del programa.");
	}

}
