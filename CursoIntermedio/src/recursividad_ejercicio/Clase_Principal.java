package recursividad_ejercicio;

import java.util.Scanner;

public class Clase_Principal {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un n�mero para calcular su factorial: ");
		int numero = entrada.nextInt();

		Recursividad recursividad = new Recursividad();
		int factorial = recursividad.Factorial(numero);

		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
